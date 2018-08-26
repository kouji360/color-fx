import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {ColorBoardComponent} from './color-board/color-board.component';
import {ColorPairService} from './service/color-pair/color-pair.service';
import {HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    ColorBoardComponent
  ],
  imports: [
    BrowserModule, HttpClientModule
  ],
  providers: [ColorPairService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
