import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ComponenteComponent } from './componente/componente.component';
import { ElencoComponent } from './elenco/elenco.component';
import { BindingComponent } from './binding/binding.component';
import { DirettiveComponent } from './direttive/direttive.component';
import { AjaxComponent } from './ajax/ajax.component';
import { NuovoLibroComponent } from './nuovo-libro/nuovo-libro.component';

@NgModule({
  declarations: [
    AppComponent,
    ComponenteComponent,
    ElencoComponent,
    BindingComponent,
    DirettiveComponent,
    AjaxComponent,
    NuovoLibroComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
