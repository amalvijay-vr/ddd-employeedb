package com.allianz.devpracticces.empdb.domain.model.allocation;

import com.allianz.devpracticces.empdb.domain.model.EntityIdentifier;

import java.util.List;


public class MemberAllocation {
	
	private String type;
	private EntityIdentifier memberAllocationId;
	private EntityIdentifier memberId;
	private List<ProjectAllocation> allocations;
	
	public MemberAllocation(String type, EntityIdentifier memberAllocationId,
			EntityIdentifier memberId, List<ProjectAllocation> allocations) {
		super();
		this.type = type;
		this.memberAllocationId = memberAllocationId;
		this.memberId = memberId;
		this.allocations = allocations;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public EntityIdentifier getMemberAllocationId() {
		return memberAllocationId;
	}

	public void setMemberAllocationId(EntityIdentifier memberAllocationId) {
		this.memberAllocationId = memberAllocationId;
	}

	public EntityIdentifier getMemberId() {
		return memberId;
	}

	public void setMemberId(EntityIdentifier memberId) {
		this.memberId = memberId;
	}

	public List<ProjectAllocation> getAllocations() {
		return allocations;
	}

	public void setAllocations(List<ProjectAllocation> allocations) {
		this.allocations = allocations;
	}
	
		
}
