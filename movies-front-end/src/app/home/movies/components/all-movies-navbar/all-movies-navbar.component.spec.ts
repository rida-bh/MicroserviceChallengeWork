import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AllMoviesNavbarComponent } from './all-movies-navbar.component';

describe('AllMoviesNavbarComponent', () => {
  let component: AllMoviesNavbarComponent;
  let fixture: ComponentFixture<AllMoviesNavbarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AllMoviesNavbarComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AllMoviesNavbarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
