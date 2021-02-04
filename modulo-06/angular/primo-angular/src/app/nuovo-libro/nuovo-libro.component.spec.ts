import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NuovoLibroComponent } from './nuovo-libro.component';

describe('NuovoLibroComponent', () => {
  let component: NuovoLibroComponent;
  let fixture: ComponentFixture<NuovoLibroComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NuovoLibroComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NuovoLibroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
