import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BotaoHistoricoComponent } from './botao-historico.component';

describe('BotaoHistoricoComponent', () => {
  let component: BotaoHistoricoComponent;
  let fixture: ComponentFixture<BotaoHistoricoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BotaoHistoricoComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(BotaoHistoricoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
