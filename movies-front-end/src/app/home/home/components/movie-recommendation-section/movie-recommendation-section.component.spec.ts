import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MovieRecommendationSectionComponent } from './movie-recommendation-section.component';

describe('MovieRecommendationSectionComponent', () => {
  let component: MovieRecommendationSectionComponent;
  let fixture: ComponentFixture<MovieRecommendationSectionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MovieRecommendationSectionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MovieRecommendationSectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
