import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FilterBySectionComponent } from './filter-by-section.component';

describe('FilterBySectionComponent', () => {
  let component: FilterBySectionComponent;
  let fixture: ComponentFixture<FilterBySectionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FilterBySectionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FilterBySectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
