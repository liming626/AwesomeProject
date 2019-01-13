import {PropTypes} from 'prop-types';
import {requireNativeComponent,View} from 'react-native';

let iface={
    name: 'TextView',
    propTypes: {
        text: PropTypes.string,
        textSize: PropTypes.number,
        textColor: PropTypes.number,
        width: PropTypes.number,
        height: PropTypes.number,
        ...View.propTypes,
        //包含默认的View的属性，如果没有这句会报‘"..."
        // has no propType for native prop "..." of native type "..."’错误
    },
};
export default requireNativeComponent('TextView',iface);