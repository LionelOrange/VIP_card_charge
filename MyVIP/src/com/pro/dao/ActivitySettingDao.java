package com.pro.dao;

import com.pro.domain.ActivitySetting;
import com.pro.domain.ChargeRecord;

public interface ActivitySettingDao {
	public ActivitySetting query(ChargeRecord record);
}
