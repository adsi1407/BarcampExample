# encoding: utf-8

def verifyElementWithText(text,control)
    text = text.to_s
    control = control.to_s
    if (control.eql? "Button")
        wait_for_elements_exist("#{control} marked:'#{text}'")
        check_element_exists("#{control} marked:'#{text}'")
    else
        wait_for_elements_exist("#{control} text:'#{text}'")
        check_element_exists("#{control} text:'#{text}'")
    end
    
    sleep(1)
end

def verifyElementWithId(id,control)
    id = id.to_s
    control = control.to_s
    wait_for_elements_exist("#{control} id:'#{id}'")
    check_element_exists("#{control} id:'#{id}'")
    
    sleep(1)
end

def verifyActivityWithName(text)
    text = text.to_s
    check_element_exists("LinearLayout id:'#{text}'")

    sleep(1)
end

def touchControlWithId(control,id)
    control = control.to_s
    id = id.to_s
    wait_for_elements_exist("#{control} id:'#{id}'")
    check_element_exists("#{control} id:'#{id}'")
    touch("#{control} id:'#{id}'")

    sleep(1)
end

def enterTextToControlWithId(text,control,id)
    text = text.to_s
    control = control.to_s
    id = id.to_s

    wait_for_elements_exist("#{control} id:'#{id}'")
    check_element_exists("#{control} id:'#{id}'")

    touch("#{control} id:'#{id}'")
    keyboard_enter_text("#{text}")

    sleep(1)
end