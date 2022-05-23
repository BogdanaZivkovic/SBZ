import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeterminationFormComponent } from './determination-form.component';

describe('DeterminationFormComponent', () => {
  let component: DeterminationFormComponent;
  let fixture: ComponentFixture<DeterminationFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeterminationFormComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DeterminationFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
