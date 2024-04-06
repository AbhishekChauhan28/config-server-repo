//package net.department.departmentservice.mapper;
//
//import net.department.departmentservice.dto.DepartmentDto;
//import net.department.departmentservice.entity.Department;
//
//public class DepartmentMapper {
//
//    public static DepartmentDto mapToDepartmentDto(Object department){
//        DepartmentDto departmentDto = new DepartmentDto(
//                department.getId(),
//                department.getDepartmentName(),
//                department.getDepartmentDescription(),
//                department.getDepartmentCode()
//        );
//        return departmentDto;
//    }
//
//    public static Department mapToDepartment(DepartmentDto departmentDto){
//        Department department = new Department(
//                departmentDto.getId(),
//                departmentDto.getDepartmentName(),
//                departmentDto.getDepartmentDescription(),
//                departmentDto.getDeparmentCode()
//        );
//        return department;
//    }
//}
