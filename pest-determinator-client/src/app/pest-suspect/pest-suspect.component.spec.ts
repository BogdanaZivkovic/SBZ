import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PestSuspectComponent } from './pest-suspect.component';

describe('PestSuspectComponent', () => {
  let component: PestSuspectComponent;
  let fixture: ComponentFixture<PestSuspectComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PestSuspectComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PestSuspectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
