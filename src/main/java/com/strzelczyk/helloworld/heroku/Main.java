package com.strzelczyk.helloworld.heroku;

import fish.payara.micro.BootstrapException;
import fish.payara.micro.PayaraMicro;

public class Main {
  public static void main(String[] args) throws BootstrapException {
      PayaraMicro.getInstance()
                .setHttpPort(Integer.parseInt(System.getenv("PORT")))
                .addDeployment("/helloWorldRestGit/target/helloWorldRestGit.war")
                .bootStrap();
  }
}