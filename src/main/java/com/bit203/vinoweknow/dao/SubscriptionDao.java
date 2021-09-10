package com.bit203.vinoweknow.dao;

import com.bit203.vinoweknow.vo.Subscription;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SubscriptionDao {
//
//   @Insert("INSERT INTO subscription(subscription_code, member_code, subscription_addr, subscription_Type, ...) VALUES(#{subscription.subCode}, #{subscription.memCode}, #{subscription.subAddr}, #{subscription.subType}, #{subscription.subPayPln}, #{subscription.subQuantity}, #{subscription.subStarDate}, #{subscription.subEndDate}, #{subscription.subProductCode})")
//   int insert(@Param("subscription") Subscription subscription);
//
//   @Select("SELECT * FROM subscription")
//   @Results(id="subscriptionMap", value={
//           @Result(property="subCode", column="subscription_code"),
//           @Result(property="subscriptionList", column="id", many=@Many(select="com.bit203.vinoweknow.SubscriptionDao.getByCompanyId"))
//   })
//   List<Subscription> getAll();
//
//   @Select("SELECT * FROM subscription WHERE subscription_code=#{subCode}")
//   @ResultMap("subscriptionMap")
//   List<Subscription> getByCompanyId(@Param("subCode") int companyId);
}
