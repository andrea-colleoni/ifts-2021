import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ComponenteComponent } from './componente/componente.component';
import { ElencoComponent } from './elenco/elenco.component';

@NgModule({
  declarations: [
    AppComponent,
    ComponenteComponent,
    ElencoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
