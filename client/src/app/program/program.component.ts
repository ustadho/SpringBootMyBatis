import { ProgramService } from './program.service';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-program',
  templateUrl: './program.component.html',
  styleUrls: ['./program.component.css']
})
export class ProgramComponent implements OnInit {
  programs: Observable<any>;

  constructor(private programService: ProgramService) { }

  ngOnInit() {
    this.programService.getAll().subscribe(data => {
      this.programs = data;
    });
  }

}
