import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BotaoAbaComponent } from './botao-aba.component';

describe('BotaoAbaComponent', () => {
  let component: BotaoAbaComponent;
  let fixture: ComponentFixture<BotaoAbaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BotaoAbaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BotaoAbaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
