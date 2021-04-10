package com.sample.android.contact.util.schedulars

import io.reactivex.Scheduler

/**
 * Allow providing different types of [Scheduler]s.
 */
interface BaseSchedulerProvider {
    
    fun computation(): Scheduler

    fun io(): Scheduler
}
