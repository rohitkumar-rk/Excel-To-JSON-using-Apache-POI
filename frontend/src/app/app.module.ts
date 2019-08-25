import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import {MatButtonModule} from '@angular/material/button';

// import {
//   MatButtonModule, MatRadioModule, MatCheckboxModule,  MatCardModule,
//   MatInputModule, MatSelectModule, MatExpansionModule, MatIconModule,
//   MatFormFieldModule, MatTableModule, MatPaginatorModule, MatSortModule } from '@angular/material';

  import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  // exports: [
  //   FormsModule,
  //   MatRadioModule,
  //   MatCheckboxModule,
  //   MatSelectModule,
  //   MatExpansionModule,
  //   MatButtonModule,
  //   MatCheckboxModule,
  //   MatInputModule,
  //   MatCardModule,
  //   MatIconModule,
  //   MatFormFieldModule,
  //   MatTableModule,
  //   MatPaginatorModule,
  //   MatSortModule
  // ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
