import kotlin.properties.ReadWriteProperty

class D {
    var date: MyDate by EffectiveDate()
}

class EffectiveDate<R> : ReadWriteProperty<R, MyDate> {

    var timeInMillis: Long? = null

    override fun get(thisRef: R, property: PropertyMetadata): MyDate {
        <taskWindow>TODO()</taskWindow>
    }

    override fun set(thisRef: R, property: PropertyMetadata, value: MyDate) {
        <taskWindow>TODO()</taskWindow>
    }
}

