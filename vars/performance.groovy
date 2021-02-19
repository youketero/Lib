def hello(){
	return "Hello dear user"
}


def choiceRememberLastSelected(List<String> paramsChoice, String nameChoice, String descriptionChoice) {
    String options = createChoicesWithPreviousChoice(paramsChoice,params[nameChoice]).join("\n")
    return choice(
        name: nameChoice, 
        choices: options,
        description: descriptionChoice
    )
}
