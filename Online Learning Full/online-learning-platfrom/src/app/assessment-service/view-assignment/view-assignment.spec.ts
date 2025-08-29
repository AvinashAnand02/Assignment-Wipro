import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewAssignment } from './view-assignment';

describe('ViewAssignment', () => {
  let component: ViewAssignment;
  let fixture: ComponentFixture<ViewAssignment>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ViewAssignment]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewAssignment);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
