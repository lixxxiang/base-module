package com.emall.base.injection

import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class PerComponentScope
