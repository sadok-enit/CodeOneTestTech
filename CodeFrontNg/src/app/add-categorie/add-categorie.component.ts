import { Component, inject, OnInit } from '@angular/core';
import { CatalogueService } from '../services/catalogue.service';

@Component({
  selector: 'app-add-categorie',
  templateUrl: './add-categorie.component.html',
  styleUrls: ['./add-categorie.component.css']
})
export class AddCategorieComponent implements OnInit{
  
  constructor( private catalService : CatalogueService){}
  
  
  ngOnInit(): void {
      
  }

  Addcateg(value : any)
  {
    this.catalService.addCategory(value.add).subscribe(data=>{

      console.log(data);
      alert ("catégorie ajoutée");
    },err=>{
      console.log(err);
    });
  }

}

