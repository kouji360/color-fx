import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-color-board',
  templateUrl: './color-board.component.html',
  styleUrls: ['./color-board.component.css']
})
export class ColorBoardComponent implements OnInit {

  constructor() { }

  name = 'aaa';
  hero = {
    name: 'watason',
    age: 25,
    nullv: null
  };

  ngOnInit() {
  }

}
