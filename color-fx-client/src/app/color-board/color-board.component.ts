import {Component, OnInit} from '@angular/core';
import {FxColorPair} from '../FxColorPair';
import {ColorPairService} from '../service/color-pair/color-pair.service';

@Component({
  selector: 'app-color-board',
  templateUrl: './color-board.component.html',
  styleUrls: ['./color-board.component.css']
})
export class ColorBoardComponent implements OnInit {

  colorPair: FxColorPair;

  constructor(private colorPairService: ColorPairService) {
  }

  ngOnInit() {
    this.colorPairService.getColorPair(1).subscribe(result => {
      return result;
    });
  }

}
