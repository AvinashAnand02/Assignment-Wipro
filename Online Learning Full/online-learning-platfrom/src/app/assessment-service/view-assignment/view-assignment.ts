import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { AssessmentService, Assessment } from '../../service/assessment.service';

@Component({
  selector: 'app-view-assignment',
  templateUrl: './view-assignment.html',
  styleUrls: ['./view-assignment.css'],
  standalone: true,
  imports: [CommonModule, RouterModule]
})
export class ViewAssignment implements OnInit {
  assignments: Assessment[] = [];

  constructor(private service: AssessmentService, private cdr: ChangeDetectorRef) {}

  ngOnInit(): void {
    this.loadAssignments();
    this.cdr.detectChanges();
  }


  loadAssignments(): void {
    this.service.getAll().subscribe(data => {
      this.assignments = data;
      this.cdr.detectChanges();
      
  });

  }

  deleteAssignment(id: number | undefined): void {
    if (!id) return;
    if (confirm('Are you sure you want to delete this assignment?')) {
      this.service.delete(id).subscribe(() => this.loadAssignments());
    }
  }
}
