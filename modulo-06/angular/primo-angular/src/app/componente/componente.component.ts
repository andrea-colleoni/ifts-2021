import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-componente',
  templateUrl: './componente.component.html',
  styleUrls: ['./componente.component.css']
})
export class ComponenteComponent implements OnInit {

  numero = 50451.2345;

  constructor() { }

  ngOnInit(): void {
  }

}
