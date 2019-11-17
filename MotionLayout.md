# [MotionLayout](https://developer.android.com/reference/android/support/constraint/motion/MotionLayout)
 
可以通过`LayoutDescription`链接`MotionScene`和`ConstraintLayout`，使得`MotionLayout`在几个`MotionScene`状态间切换

|Tags|Description|
|:--|:--|
|`<StateSet>`|状态|
|`<ConstraintSet>`|约束集合|
|`<Transition>`|描述两个状态间约束关系|

## Transition
|Attributes|Description|
|:--|:--|
|android:id|ID标识|
|constraintSetStart|起始约束|
|constraintSetEnd|终结约束|
|motionInterpolator|插值器|
|duration|装换时间|
|staggered|交错 让不同约束产生交错|
|autoTransition|自动转场到某种状态 {none, jumpToStart, jumpToEnd, animateToStart, animateToEnd}|
|`<OnSwipe>`|Touch处理|
|`<OnClick>`|点击处理|
|`<KeyFrameSet>`|关键帧|

### OnSwipe(可选)
|Attributes|Description|
|:--|:--|
|touchAnchorId|touch的锚点|
|touchRegionId|限制touch范围 即使它不可见|
|touchAnchorSide|锚点的一侧 {top|left|right|bottom}|
|maxVelocity|最大速率 默认为4|
|dragDirection|拖拽方向 {dragUp|dragDown|dragLeft|dragRight}|
|maxAcceleration|最大加速度 默认 1.2|
|dragScale|滑动比例因子|
|moveWhenScrollAtTop|如果滑动伴随着滚动(RecyclerView或NestedScrollView)是否滚动或过度|
|autoComplete|是否自动完成过渡|

### OnClick(可选)
|Attributes|Description|
|:--|:--|
|motionTarget|触发Click的视图|
|clickAction|触发后的动作{transitionToEnd，transitionToStart，jumpToEnd，jumpToStart}|

## StateSet
|Attributes|Description|
|:--|:--|
|`<State>`|状态|

### State
|Attributes|Description|
|:--|:--|
|id|ID标识|
|constraints|状态对应的ConstraintSet或Layout|
|Variant|匹配不同的约束|

#### Variant
|Attributes|Description|
|:--|:--|
|region_widthLessThan|宽度小于匹配|
|region_widthMoreThan|宽度大于匹配|
|region_heightLessThan|高度小于匹配|
|region_heightMoreThan|高度大于匹配|
|constraints|ConstraintSet或Layout Id|

## ConstraintSet
|Attributes|Description|
|:--|:--|
|android:id|ID 标识|
|`<Constraint>`|ConstraintSet|

### Constraint
|Attributes|Description|
|:--|:--|
|android:id||
|[ConstraintLayout attributes]||
|[Standard View attributes]||
|transitionEasing||
|pathMotionArc||
|transitionPathRotate||
|drawPath||
|progress||
|`<CustomAttribute>`||
|`<Layout>`||
|`<PropertySet>`||
|`<Transform>`||
|`<Motion>`||

#### Layout

#### PropertySet
|Attributes|Description|
|:--|:--|
|visibility||
|alpha||
|motionProgress||
|layout_constraintTag||

#### Transform
|Attributes|Description|
|:--|:--|
|android:elevation||
|android:rotation||
|android:rotationX||
|android:rotationY||
|android:scaleX||
|android:scaleY||
|android:translationX||
|android:translationY||
|android:translationZ||

#### Motion
|Attributes|Description|
|:--|:--|
|transitionEasing||
|pathMotionArc||
|motionPathRotate||
|drawPath||

##### CustomAttribute
|Attributes|Description|
|:--|:--|
|attributeName||
|customColorValue||
|customIntegerValue||
|customFloatValue||
|customStringValue||
|customDimension||
|customBoolean||

### KeyFrameSet
|Attributes|Description|
|:--|:--|
|`<KeyPosition>`||
|`<KeyAttribute>`||
|`<KeyCycle>`||
|`<KeyTimeCycle>`||
|`<KeyTrigger>`||

#### KeyPosition
|Attributes|Description|
|:--|:--|
|motionTarget||
|framePosition||
|transitionEasing||
|pathMotionArc||
|keyPositionType||
|percentX||
|percentY||
|percentWidth||
|percentHeight||
|curveFit||
|drawPath||
|sizePercent||
|curveFit||

### KeyAttribute
|Attributes|Description|
|:--|:--|
|motionTarget||
|framePosition||
|curveFit||
|transitionEasing||
|transitionPathRotate||
|drawPath||
|motionProgress||
|[standard view attributes]||
|`<CustomAttribute>`||

#### CustomAttribute
|Attributes|Description|
|:--|:--|
|attributeName||
|customColorValue||
|customIntegerValue||
|customFloatValue||
|customStringValue||
|customDimension||
|customBoolean||

### KeyCycle
|Attributes|Description|
|:--|:--|
|motionTarget||
|framePosition||
|[Standard View attributes]||
|waveShape||
|wavePeriod||
|waveOffset||
|transitionPathRotate||
|progress||
|`<CustomAttribute>`||

#### CustomAttribute
|Attributes|Description|
|:--|:--|
|attributeName||
|customFloatValue||

### KeyTimeCycle
|Attributes|Description|
|:--|:--|
|motionTarget||
|framePosition||
|[Standard View attributes]||
|waveShape||
|wavePeriod||
|waveOffset||
|transitionPathRotate||
|progress||
|`<CustomAttribute>`||

#### CustomAttribute
|Attributes|Description|
|:--|:--|
|attributeName||
|customFloatValue||

### KeyTrigger
|Attributes|Description|
|:--|:--|
|motionTarget||
|framePosition||
|onCross||
|onPositiveCross||
|onNegativeCross||
|triggerSlack||
|triggerId||
|motion_postLayoutCollision||
|motion_triggerOnCollision||

## Standard attributes
|Attributes|Description|
|:--|:--|
|android:visibility||
|android:alpha||
|android:elevation||
|android:rotation||
|android:rotationX||
|android:rotationY||
|android:scaleX||
|android:scaleY||
|android:translationX||
|android:translationY||
|android:translationZ||