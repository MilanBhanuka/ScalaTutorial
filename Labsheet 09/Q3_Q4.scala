class Account(val ACnumber:String, var initialBalance:Double) {
      private var balance = initialBalance
      def deposit(amount:Double):Unit = {
            balance += amount
            println(s"\nDeposited $amount. New balance: $balance")     
      }

      def withdraw(amount:Double):Unit = {
            balance -= amount
            println(s"\nWithdrew $amount. New balance: $balance")
      }

      def transferTo(receiverAcc:Account, amount:Double):Unit = {
            balance -= amount
            receiverAcc.deposit(amount)
            println(s"\nTransferred $amount . New balance: $balance")
      }
      def getBalance:Double = balance

      override def toString:String = s"Account: $ACnumber   Account Balance  $balance "
}

class Bank{
      private var accounts:List[Account] = Nil
      def addAccount(acc:Account):Unit = {
            accounts ::= acc
      }
      //List of Accounts with negative balances
      def accountsWithNegativeBalance:List[Account] = {
            accounts.filter(_.getBalance < 0)
      }
      //Calculate the sum of all account balances
      def sumOfAllAccounts:Double = {
            accounts.map(_.getBalance).sum
      }
      //Calculate the final balances of all accounts after apply the interest function
      def applyInterest(): Unit =
            for (acc <- accounts) {
                  if (acc.getBalance > 0) acc.deposit(acc.getBalance * 0.05)
                  else acc.withdraw(acc.getBalance.abs * 0.1)
            }
      def getAccounts: List[Account] = accounts
}

object Main2{
      def main(args: Array[String]): Unit = {
            //Q3
            val a1 = new Account("123456789", 1000)
            val a2 = new Account("987654321", 2000)
            println(a1)
            println(a2)
            a1.deposit(100)
            println(a1)
            a1.withdraw(200)
            println(a1)
            a1.transferTo(a2, 500)
            println(a1)
            println(a2)
            
            //Q4
            println("\n\n\n")
            val bank = new Bank()
            bank.addAccount(new Account("1", -100))
            bank.addAccount(new Account("2", -200))
            bank.addAccount(new Account("3", 900))
            bank.addAccount(new Account("4", -400))
            bank.addAccount(new Account("5", 1500))
            bank.addAccount(new Account("6", -600))
            bank.addAccount(new Account("7", -500))
            bank.addAccount(new Account("8", 1800))
            bank.addAccount(new Account("9", -900))
            bank.addAccount(new Account("10", 1000))

            val negativeAccounts = bank.accountsWithNegativeBalance
            println("Accounts with negative balances:")
            negativeAccounts.foreach(println)

            val sumOfBalances = bank.sumOfAllAccounts
            println(s"\nSum of all account balances: $sumOfBalances")

            bank.applyInterest()
            println("\nAfter applying interest:")
            bank.getAccounts.foreach(println)
      }
}

