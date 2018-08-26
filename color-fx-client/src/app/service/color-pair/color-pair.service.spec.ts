import { TestBed, inject } from '@angular/core/testing';

import { ColorPairService } from './color-pair.service';

describe('ColorPairService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ColorPairService]
    });
  });

  it('should be created', inject([ColorPairService], (service: ColorPairService) => {
    expect(service).toBeTruthy();
  }));
});
