import { Role } from "./enum";

export interface User{
    id?:number,
    name:string,
    email:string,
    password:string,
    role: Role
}

export interface Course{
    id?: number,
    title: string,
    description: string,
    duration: string,
    createdAt: string
}

export interface Classroom{
    id?:number,
    title:string,
    instructor:string,
    duration:number
}

export interface Assignments {
  id?: number;
  title: string;
  description: string;
  courseId: number; 
  classroomId: number; 
  dueDate: string; 
  createdAt?: string; 
}