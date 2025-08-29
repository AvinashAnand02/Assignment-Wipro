import { Routes } from '@angular/router';

// User Components
import { ViewUser } from './user-service/view-user/view-user';
import { AddUser } from './user-service/add-user/add-user';
import { EditUser } from './user-service/edit-user/edit-user';

// Menu
import { Menu } from './menu/menu';

// Course Components
import { ViewCourse } from './course-service/view-course/view-course';
import { AddCourse } from './course-service/add-course/add-course';
import { EditCourse } from './course-service/edit-course/edit-course';

// Classroom Components
import { ViewClassroom } from './classroom-service/view-classroom/view-classroom';
import { AddClassroom } from './classroom-service/add-classroom/add-classroom';
import { EditClassroom } from './classroom-service/edit-classroom/edit-classroom';

// Assignment Components
import { ViewAssignment } from './assessment-service/view-assignment/view-assignment';
import { AddAssignment } from './assessment-service/add-assignment/add-assignment';
import { EditAssignment } from './assessment-service/edit-assignment/edit-assignment';

export const routes: Routes = [
    { path: '', component: Menu },

    // User Routes
    { path: 'user', component: ViewUser },
    { path: 'add-user', component: AddUser },
    { path: 'edit-user/:id', component: EditUser },

    // Course Routes
    { path: 'course', component: ViewCourse },
    { path: 'add-course', component: AddCourse },
    { path: 'edit-course/:id', component: EditCourse },

    // Classroom Routes
    { path: 'classroom', component: ViewClassroom },
    { path: 'add-classroom', component: AddClassroom },
    { path: 'edit-classroom/:id', component: EditClassroom },

    // Assignment Routes
    { path: 'assessments', component: ViewAssignment },
    { path: 'assessments/add', component: AddAssignment },
    { path: 'assessments/edit/:id', component: EditAssignment },
];
