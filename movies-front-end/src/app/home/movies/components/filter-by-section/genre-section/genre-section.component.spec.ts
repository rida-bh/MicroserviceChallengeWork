import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GenreSectionComponent } from './genre-section.component';

describe('GenreSectionComponent', () => {
  let component: GenreSectionComponent;
  let fixture: ComponentFixture<GenreSectionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GenreSectionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GenreSectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
