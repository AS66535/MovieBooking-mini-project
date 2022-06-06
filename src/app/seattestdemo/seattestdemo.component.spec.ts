import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SeattestdemoComponent } from './seattestdemo.component';

describe('SeattestdemoComponent', () => {
  let component: SeattestdemoComponent;
  let fixture: ComponentFixture<SeattestdemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SeattestdemoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SeattestdemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
