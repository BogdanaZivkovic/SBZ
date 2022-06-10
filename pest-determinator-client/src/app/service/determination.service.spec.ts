import { TestBed } from '@angular/core/testing';

import { DeterminationService } from './determination.service';

describe('DeterminationService', () => {
  let service: DeterminationService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DeterminationService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
