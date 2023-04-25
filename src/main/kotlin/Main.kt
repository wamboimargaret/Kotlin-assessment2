fun main(args: Array<String>) {
 println( randomStr("alphabet"))
   println(enterPassword("km34w3school"))
   multiples(range = 1..100)
var person1= CurrentAccount(220220,"Megan",1500)
   person1.deposit(500.0)
   person1.withdraw(150.0)
   person1.details()

   var person2 = SavingsAccount(220220,"Megan",1500,300)
   person2.accountWithdraw()
}
//1. Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun randomStr(str:String):Any{
   var first = str[0]
   var last =str.lastIndexOf(str)
   var length = str.length
   return ("first character is $first , the last character is $last and the length of the string is $length")


}

//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)

fun enterPassword(password:String):Boolean{
   var pass = " "

   if (password.length==8 && password.length!==16 && pass!=="password"){
      return true
   }
   else{
      return false
   }
}

//3. Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun multiples(range: IntRange){
   for (num in range){
      if(num %6==2 && num %8 ==2){
         println ("Bingo")
      }
      else if (num%6==0){
         println(num)
      }
      else if(num%8==0){
         println(num)
      }
      else{
         println("null")
      }
   }
}
//4. Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)
open class CurrentAccount(var accountnumber:Int, var name:String, var balance:Int){
   fun deposit(amount: Double){
      var bal = balance+amount
      println(bal)
   }
   fun withdraw(amount: Double){
      var dep = balance-amount
      println(dep)
   }

   fun details(){
      println("Account number $accountnumber with balance $balance is operated by $name")
   }
}

//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)
class SavingsAccount(accountnumber: Int, name: String, balance: Int,var widthdrawal:Int): CurrentAccount(accountnumber,name,balance){
fun accountWithdraw(){
   if (widthdrawal<=4){
      accountnumber-widthdrawal
   }
}
}