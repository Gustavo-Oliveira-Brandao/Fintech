import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-carteira',
  standalone: true,
  imports: [],
  templateUrl: './carteira.component.html',
  styleUrl: './carteira.component.sass'
})
export class CarteiraComponent {

  @Input() public logo:any
  @Input() public objetivoCarteira:any
  @Input() public valor:any
}
