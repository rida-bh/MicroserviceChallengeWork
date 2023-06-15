import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LanguageSectionComponent } from './language-section.component';

describe('LanguageSectionComponent', () => {
  let component: LanguageSectionComponent;
  let fixture: ComponentFixture<LanguageSectionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LanguageSectionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LanguageSectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
