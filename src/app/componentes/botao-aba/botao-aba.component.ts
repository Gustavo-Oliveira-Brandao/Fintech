import { Component, Input } from '@angular/core';
@Component({
  selector: 'app-botao-aba',
  standalone: true,
  imports: [ ],
  templateUrl: './botao-aba.component.html',
  styleUrl: './botao-aba.component.sass'
})
export class BotaoAbaComponent {

  @Input() public logo:any
  @Input() public texto:any
}
