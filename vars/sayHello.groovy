#!/usr/bin/env groovy
/*
def call(String name,String dayOfweek){
 sh "echo ${name}, To day is ${dayOfweek}."
}*/

def call(Map config = [:]){
 sh "echo ${config.name},To is ${config.dayOfweek}."
}
