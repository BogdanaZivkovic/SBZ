import { TestBed } from '@angular/core/testing';

import { DeterminationFormService } from './determination-form.service';

describe('DeterminationFormService', () => {
  let service: DeterminationFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DeterminationFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
