package com.pius.jul042.test;

import java.util.List;

import com.pius.jul042.test.Test;

public interface TestMapper {
	public abstract int regTest(Test t);
	public abstract List<Test> getAllTest();
}
