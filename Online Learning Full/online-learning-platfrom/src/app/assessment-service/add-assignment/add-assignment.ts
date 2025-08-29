import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Router } from '@angular/router';
import { ReactiveFormsModule, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AssessmentService, Assessment } from '../../service/assessment.service';

@Component({
  selector: 'app-add-assignment',
  templateUrl: './add-assignment.html',
  styleUrls: ['./add-assignment.css'],
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule, RouterModule]
})
export class AddAssignment implements OnInit {
  form!: FormGroup;

  constructor(
    private fb: FormBuilder,
    private service: AssessmentService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.form = this.fb.group({
      title: ['', Validators.required],
      type: ['', Validators.required],
      dueDate: ['', Validators.required],
      passingCriteria: ['', Validators.required]
    });
  }

  onSubmit(): void {
    if (this.form.invalid) return;
    const newAssignment: Assessment = this.form.value;
    this.service.create(newAssignment).subscribe(() => this.router.navigate(['/assessments']));
    console.log("Data saved");
  }
}
