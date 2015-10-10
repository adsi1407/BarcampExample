# encoding: utf-8

Given (/^inicia la aplicacion$/) do
    element_exists("TextView marked:'BarcampExample'")
end

When(/^se inicializa la ventana de "(.*?)"$/) do |text|
    verifyActivityWithName(text)
end

Then(/^presiono la imagen "(.*?)"$/) do |id|
    touchControlWithId("ImageView",id)
end

Then(/^presiono el boton "(.*?)"$/) do |id|
    touchControlWithId("AppCompatButton",id)
end

Then(/^observo el texto "(.*?)"$/) do |text|
    verifyElementWithText(text,"AppCompatTextView")
end

Then(/^observo la imagen "(.*?)"$/) do |id|
    verifyElementWithId(id,"ImageView")
end

Then(/^observo el spinner "(.*?)"$/) do |id|
    verifyElementWithId(id,"MvxSpinner")
end

Then(/^observo el campo de texto "(.*?)"$/) do |id|
    verifyElementWithId(id,"*EditText")
end

Then(/^observo el boton "(.*?)"$/) do |id|
    verifyElementWithId(id,"AppCompatButton")
end

Then(/^ingresar el texto "(.*?)" en el campo de texto "(.*?)"$/) do |text, id|
    enterTextToControlWithId(text,"AppCompatEditText" ,id)
end

Then(/^se oculta el teclado$/) do
    hide_soft_keyboard
end

Then(/^se muestra la alerta con el titulo "(.*?)"$/) do |text|
    enterTextToControlWithId(text,"DialogTitle" ,"alertTitle")
end

Then(/^observo el boton con el texto "(.*?)"$/) do |text|
    verifyElementWithText(text,"AppCompatButton")
end






