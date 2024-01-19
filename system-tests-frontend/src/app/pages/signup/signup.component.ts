import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from "@angular/material/input"
import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-signup',
  standalone: true,
  imports: [MatFormFieldModule, ReactiveFormsModule, MatInputModule],
  templateUrl: './signup.component.html',
  styleUrl: './signup.component.css'
})
export class SignupComponent {
  form: FormGroup;

  constructor(private fb: FormBuilder, private _userService: UserService) {
    this.form = this.fb.group({
      username: ['', Validators.required],
      password: ['', Validators.required],
      name: ['', Validators.required],
      lastName: ['', Validators.required],
      email: ['', Validators.required],
      cellPhone: ['', Validators.required]
    });
  };

  formSubmit() {
    const user: any = {
      username: this.form.value.username,
      password: this.form.value.password,
      name: this.form.value.name,
      lastName: this.form.value.lastName,
      email: this.form.value.email,
      cellPhone: this.form.value.cellPhone,
    }
    console.log(user)

    this._userService.addUser(user).subscribe((data) => {
      console.log(data);
      alert("User resgistered successfully");
    }, (error) => {
      console.log(error);
      alert("ERROR");
    });
  }
}
