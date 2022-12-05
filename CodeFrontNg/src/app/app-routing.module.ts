import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import {ProductsComponent} from './products/products.component'
import { HomeComponent } from './home/home.component';
import { AddProductComponent } from './add-product/add-product.component';
import { AddCategorieComponent } from './add-categorie/add-categorie.component';
const routes: Routes = [
  { path: 'Products', component:ProductsComponent },
  { path: '', component:HomeComponent},
  { path: 'AddProduct', component:AddProductComponent },
  { path: 'AddCategory', component:AddCategorieComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
