import { Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { HistoricoTransacoesComponent } from './componentes/historico-transacoes/historico-transacoes.component';

export const routes: Routes = [
    {path: '', component: HomeComponent},
    { path: 'transacoes', component: HistoricoTransacoesComponent},
    { path: 'metas', component: HistoricoTransacoesComponent},
    { path: 'investimentos', component: HistoricoTransacoesComponent}
];
