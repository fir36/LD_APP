import React, {useEffect} from 'react';
import {View, Text} from 'react-native';
import {LDClient, LDConfig, LDUser} from 'launchdarkly-react-native-client-sdk';

const config = new LDConfig('YOUR_MOBILE_KEY');
const user = new LDUser('example-user-key');

const App = () => {
  useEffect(() => {
    LDClient.initialize(config, user);
  }, []);

  return (
    <View style={{flex: 1, justifyContent: 'center', alignItems: 'center'}}>
      <Text>LaunchDarkly React Native Example</Text>
    </View>
  );
};

export default App;
