import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DirettiveComponent } from './direttive.component';

describe('DirettiveComponent', () => {
  let component: DirettiveComponent;
  let fixture: ComponentFixture<DirettiveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DirettiveComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DirettiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
