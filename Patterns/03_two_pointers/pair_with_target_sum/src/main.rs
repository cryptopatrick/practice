// Problem statement
// Given an array of sorted numbers and a target sum, find the pair
// in the array whose sum is equal to the given target.
// Note: the passed slice is expected to be sorted.
fn pair_with_target_sum(v:Vec<i32>, target:i32) -> Vec<i32> {
        let mut left: usize = 0;
    let mut right: usize = v.len()-1;
    let mut res: Vec<i32> = Vec::new();
    
    let mut compare:i32 = v[left] + v[right];

    while left < right {
        compare = v[left] + v[right];
        println!("{}", compare);

        if compare == target {
            res.push(left as i32);
            res.push(right as i32);
            return res
        }
        
        if compare < target {
            left += 1;
        } else {
            right -= 1;
        }
    }

    res
    
}

#[cfg(test)]
mod test{
    use super::*;

    #[test]
    fn test_01(){
        let v:Vec<i32> = vec![1,2,3,4,6];
        let t:i32 = 6;
        assert_eq!(vec![1,3], pair_with_target_sum(v,t));
    }

    #[test]
    fn test_02(){
        let v:Vec<i32> = vec![3,2,4];
        let t:i32 = 6;
        assert_eq!(vec![1,2], pair_with_target_sum(v,t));
    }
}