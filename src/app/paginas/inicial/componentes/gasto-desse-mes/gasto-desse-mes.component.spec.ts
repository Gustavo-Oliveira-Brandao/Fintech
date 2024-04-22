import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GastoDesseMesComponent } from './gasto-desse-mes.component';

describe('GastoDesseMesComponent', () => {
  let component: GastoDesseMesComponent;
  let fixture: ComponentFixture<GastoDesseMesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [GastoDesseMesComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(GastoDesseMesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
