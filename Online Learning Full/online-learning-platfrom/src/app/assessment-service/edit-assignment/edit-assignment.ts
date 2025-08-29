import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Router, ActivatedRoute } from '@angular/router';
import { ReactiveFormsModule, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AssessmentService, Assessment } from '../../service/assessment.service';

@Component({
  selector: 'app-edit-assignment',
  templateUrl: './edit-assignment.html',
  styleUrls: ['./edit-assignment.css'],
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule, RouterModule]
})
export class EditAssignment implements OnInit {
  form!: FormGroup;
  id!: number;

  constructor(
    private fb: FormBuilder,
    private service: AssessmentService,
    private router: Router,
    private route: ActivatedRoute
  ) {}

  ngOnInit(): void {
    this.id = +this.route.snapshot.params['id'];
    this.form = this.fb.group({
      title: ['', Validators.required],
      type: ['', Validators.required],
      dueDate: ['', Validators.required],
      passingCriteria: ['', Validators.required]
    });

    this.service.getById(this.id).subscribe(data => this.form.patchValue(data));
  }

  onSubmit(): void {
    if (this.form.invalid) return;
    this.service.update(this.id, this.form.value).subscribe(() => this.router.navigate(['/assignments']));
  }
}
