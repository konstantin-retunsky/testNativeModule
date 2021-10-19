import React from 'react'
import { Button, StyleSheet, Text, View } from 'react-native'
import CalendarModule from './src/CalendarModule';

interface Props {

}

const NewModuleButton = () => {

  const onPress = () => {
    CalendarModule.createCalendarEvent('testName', 'testLocation');
    console.log('We will invoke the native module here!');
  };

  return <Button
    title="Click to invoke your native module!"
    color="#841584"
    onPress={onPress}
  />;
};

const App = (props: Props) => {

  return (
    <View>
      <NewModuleButton />
      <Text>
        hello eeboi
      </Text>
    </View>
  )
}

export default App

const styles = StyleSheet.create({})
