import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Assessment {
  id?: number;
  title: string;
  type: string;
  dueDate: string;
  passingCriteria: string;
}

@Injectable({
  providedIn: 'root'
})
export class AssessmentService {
  private baseUrl = 'http://localhost:4444/api/assessments';

  constructor(private http: HttpClient) {}

  getAll(): Observable<Assessment[]> {
    return this.http.get<Assessment[]>(this.baseUrl);
  }

  getById(id: number): Observable<Assessment> {
    return this.http.get<Assessment>(`${this.baseUrl}/${id}`);
  }

  create(assessment: Assessment): Observable<Assessment> {
    return this.http.post<Assessment>(this.baseUrl, assessment);
  }

  update(id: number, assessment: Assessment): Observable<Assessment> {
    return this.http.put<Assessment>(`${this.baseUrl}/${id}`, assessment);
  }

  delete(id: number): Observable<void> {
    return this.http.delete<void>(`${this.baseUrl}/${id}`);
  }
}
